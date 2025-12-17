pipeline{
    agent any
    stages{
        stage('first build stage'){
            steps{
                echo 'This is the first build stage.'
                echo 'Building...'
                echo 'Build complete.'
            }
        }
        stage('second build stage'){
            steps{
                echo 'This is the second build stage.'
                echo 'Building...'
                echo 'Build complete.'
            }
        }
    }
    post{
        success{
            echo 'The build was successful!'
        }
        failure{
            echo 'The build failed.'
            echo" Please check the logs for more details."
            echo 'Notifying the team about the failure.'
        }
        always{
            echo 'This will always run after the build.'
        }
    }
}