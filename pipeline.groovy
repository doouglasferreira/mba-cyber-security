#!/usr/bin/env groovy
 
pipeline {
    //Agent é o NÓ que vai rodar o job
    agent any
 
    //Fases do pipeline
    stages {
        
       stage('build') {
            steps {
                script {
                    echo 'fazer build do projeto'
                    sh "ls -la"
                    sh "pwd"
                        
                }
            }
        }
        stage('unit-test') {
            steps {
                script {
                    echo 'fazendo teste do projeto'
                    sh "ls -la"
                    sh "pwd"
                        
                }
            }
        } 
        stage('deploy to stage') {
            steps {
                script {
                    echo 'fazendo o deploy do projeto'
                    sh "ls -la"
                    sh "pwd"
                        
                }
            }
        }
         stage('acceptance test') {
            steps {
                script {
                    echo 'acceptance test projeto'
                    sh "ls -la"
                    sh "pwd"      
                }
            }
        }
          stage('deploy to prodution') {
            steps {
                script {
                    echo 'deploy to prodution do projeto'
                    sh "ls -la"
                    sh "pwd"
                }
            }
         }
    }
}
