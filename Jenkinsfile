
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

        stage('Build Docker Image') {
            steps {
                bat '"C:\\Users\\laura\\AppData\\Local\\Programs\\DockerDesktop\\resources\\bin\\docker.exe" build -t disney-around-the-world:latest .'
            }
        }
    }

    post {
        success {
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
    }
}
