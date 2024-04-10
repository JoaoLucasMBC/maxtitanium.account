pipeline {
    agent any
    stages {
        stage('Jenkins Account') {
            steps {
                echo 'Account Interface'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}