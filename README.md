# Demo QA Project
###### 1.  How to run these tests locally?

First of all, you need to clone this project that you are going to run to your local environment.

```git clone https://github.com/numanhan/demoQa.git ```

You can open the project using any IDE. Intellij IDEA is generally recommended for Maven projects. 

You can download from here : https://www.jetbrains.com/idea/download/#section=mac

You need to open the project in the IDE and ensure that the pom.xml files are indexed. 

This project is coded with Selenium and Gauge using Maven and Java.

Check here : https://docs.gauge.org/

After the required dependencies of the project are indexed, click on the specs folder in the project directory.

Gauge projects often encounter an error after initial setup. To fix this error, you can close the project and open it again. When you act, you will not encounter any errors in the specs files. When you click the Run button, our tests will run.

Specs folders contain all test steps in BDD format.


2. ######  How to run the test in CI/CD pipeline? 
  - Run the command ```brew install jenkins-lts``` on your terminal.
  - This command install Jenkins CI/CD tool on your local environment.
  - For start your Jenkins on localhost type this command ```brew services start jenkins-lts``` on your terminal
  - Usually Jenkins run on localhost:8080
  - Type ```localhost:8080``` on your browser and enter
  - You will see the Jenkins Dashboard
  - New item -> Freestyle Project
  - Source Code Management -> Paste Git Repository URL
  - You need to add credential for git repository. Check here: https://www.jenkins.io/blog/2021/07/27/git-credentials-binding-phase-1/
  -  After you added your project click Build Now and you can build your project on your pipeline

###### 3.  What you used to select the scenarios, what was your approach? 
I preferred to use the BDD structure while creating my scenarios. BDD allows us to act like a user in test scenarios by taking into account the user's behavior, and thus to get results close to the user. At the same time, while creating the project infrastructure, I tried to fit the Page Object Modal structure. In this way, when we want to add a new scenario in the future, we will add a scenario, the methods connected to this scenario and the necessary pages once. We will be able to avoid writing methods again and again every time. At the same time, we avoid memory usage. We can save time and memory while running our tests within the Pipeline.

###### 4. Why are they the most important? 
 The most important ones are;
1 - Creating scenarios based on user behavior
2 - Avoiding code duplication using the Page Object Model
3 - Leaving memory as light as possible, avoiding code repetition
4 - To leave a clean code structure for people who may be involved in the project later on and to help them understand
