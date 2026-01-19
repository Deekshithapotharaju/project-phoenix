pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out source code'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Building the application'
                bat 'gradlew.bat build'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests'
                bat 'gradlew.bat test'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying application'
                echo 'Deployment successful (simulated)'
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully'
            archiveArtifacts artifacts: 'app/build/distributions/*.zip', fingerprint: true
        }

        failure {
            echo 'Pipeline failed — stopping execution'
        }
    }
}
