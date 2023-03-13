pipeline{
	agent any
	stages {
		stage('Clone Git') {
			steps {
				git 'https://github.com/Tejinder7/MavenSPE.git'
			}
		}
		stage('Maven Build') {
      steps {
        // Maven build, 'sh' specifies it is a shell command
        sh 'mvn clean install'
      }
    }
	}
}
