# journey_builder
mongo based journey builder built on spring boot

## Run
gradlew bootRun

## Swagger
http://localhost:8080/swagger-ui.html

## Steps

### Fork

Always fork into your own repository to make changes. https://help.github.com/articles/fork-a-repo/
╰─$ git clone git@github.net:name/project.git

### Sync your fork

Typically you will have changes committed to the master/branch while you are working on your own repo. Ensure that your fork is always up-to-date (preferably during the start of your day) with changes merged by others. This will ensure you can keep merge conflicts to a minimum  

git remote add upstream - the master/branch url  
In this example, I have used the master itself  
  
╰─$ git remote -v  
origin	git@github.net:name/project.git (fetch)  
origin	git@github.net:name/project.git (push)  
  
╰─$ git remote add upstream git@github.net:name/project.git  
╰─$ git remote -v  
origin	https://github.com/veeseekay/journey_builder.git (fetch)  
origin	https://github.com/veeseekay/journey_builder.git (push)  
upstream	https://github.com/veeseekay/journey_builder.git (fetch)  
upstream	https://github.com/veeseekay/journey_builder.git (push)  
  
╰─$ git fetch upstream should now fetch the latest from your master/branch (upstream) 
╰─$ git merge upstream/master automatically merge in case of non-conflicts  
  
### Commit  
  
Commit to your local repo and push the changes to github  

╰─$ git add . Will add all changed files to staging  
╰─$ git status Will show status of file changes  
╰─$ git commit -m "<merge comment>" Ensure you have clear comment of the changes you did  
╰─$ git push Ensure you push to github  
