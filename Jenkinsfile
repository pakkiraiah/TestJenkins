pipeline {
    agent any 
	
    stages {
	stage('SCM CHECKOUT'){
		echo "Checkout"
		git credentialsId: '68d40146-7257-4801-87af-39317bca5899', url: 'https://github.com/pakkiraiah/TestJenkins.git'
	}
        stage('Build') {
             echo 'Building..'
	     echo 'Maven Version..'
	     def mymvn = tool name: 'MyMaven', type: 'maven'
	     def mycmd="${mymvn}/bin/mvn"
             sh "${mycmd} --version"
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


