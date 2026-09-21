pipeline {
    agent any

    tools {
        maven 'Maven 3.9.16'
    }

    stages {
        stage('Build and Test') {
            steps {
                bat 'mvn clean package'
            }
        }
    }

    post {
        success {
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
    }
}