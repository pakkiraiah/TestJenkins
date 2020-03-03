pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
			    echo 'Building..'
				echo 'Maven Version..'
                sh 'mvn --version'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}


