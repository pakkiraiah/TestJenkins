pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
			    echo 'Building..'
				echo 'Maven Version..'
				def mymvn = tool name: 'MyMaven', type: 'maven'
				def mycmd="${}/bin/mvn"
                sh "${mycmd} --version"
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


