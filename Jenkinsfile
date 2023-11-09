pipeline {
    agent any 

    triggers {
        cron('H 30 8 * *') // For nightly builds at 2 PM IST (which is 8:30 AM UTC)
        // Add this line to trigger builds on Git push events
        pollSCM('H/5 * * * *') // Poll every 5 minutes as a fallback
    }

    environment {
        MAVEN_HOME = "${tool name='M3'}"
    }

    stages {
        stage('Checkout') {
            steps {
                checkout([
                    $class: 'GitSCM', 
                    branches: [[name: '*/master']],
                    userRemoteConfigs: [[
                        url: 'https://github.com/DakshinaMoorthyPV/VOR.git',
                        credentialsId: 'Dakshina_Git'
                    ]]
                ])
            }
        }

        stage('Build and Test') {
            steps {
                // Using Maven to build and test the Selenium project
                sh "${MAVEN_HOME}/bin/mvn clean install"
            }
            post {
                always {
                    // Assuming tests generate reports in 'target/surefire-reports'
                    junit '**/target/surefire-reports/*.xml'

                    // Archive the raw test results
                    archiveArtifacts artifacts: '**/target/surefire-reports/*', fingerprint: true
                    
                    // Publish HTML report if your tests generate an HTML report
                    publishHTML([
                        reportDir: 'target/surefire-reports',
                        reportFiles: 'index.html',
                        reportName: "HTML Test Report",
                        keepAll: true,
                        allowMissing: false
                    ])
                }
            }
        }
    }

    post {
        always {
            def recipients = 'dakshina.moorthy@visionetsystem.com, bhuvaneswari.t@visionetsystems.com'
            def ccRecipients = 'dhruvakumar.r@visionet.com'
            def firstNames = recipients.split(',').collect { it.split('@')[0] }.join(', ')
            
            emailext (
                to: recipients,
                cc: ccRecipients,
                subject: "Jenkins Build: ${currentBuild.fullDisplayName}",
                body: """\
                    Hello ${firstNames},

                    Here are the details of the Jenkins build:
                    Build: ${currentBuild.fullDisplayName}
                    Status: ${currentBuild.result}
                    Console Log: ${Jenkins.URL}${currentBuild.url}console
                """,
                mimeType: 'text/plain'
            )
            
            // Send Slack Notification
            slackSend (
                color: currentBuild.result == 'SUCCESS' ? 'good' : 'danger',
                message: "Build: ${currentBuild.fullDisplayName}, Status: ${currentBuild.result}"
            )
            
            // Copying test report to the project folder
            script {
                def reportPath = 'target/surefire-reports'
                def destinationPath = 'under/test-report/jenkins/report'
                sh "mkdir -p ${destinationPath}"
                sh "cp -r ${reportPath}/* ${destinationPath}/"
            }
        }
        success {
            echo "The build was successful!"
            // Additional steps for successful builds if required
        }
        failure {
            echo "The build failed!"
            // Additional steps for failed builds if required
        }
    }
}
