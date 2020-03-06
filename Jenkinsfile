pipeline {
    agent any

    stages {
        stage('Build') {
             echo 'Building..'
	     echo 'Maven Version..'
	     def mymvn = tool name: 'MyMaven', type: 'maven'
	     def mycmd="${mymvn}/bin/mvn"
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


