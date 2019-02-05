# journey_builder
mongo based journey builder built on spring boot

## Swagger
http://localhost:8080/swagger-ui.html

## Steps

### Fork

Always fork into your own repository to make changes. https://help.github.com/articles/fork-a-repo/
╰─$ git clone git@github.net:name/project.git

### Sync your fork

Typically you will have changes committed to the master/branch while you are working on your own repo. Ensure that your fork is always up-to-date (preferably during the start of your day) with changes merged by others. This will ensure you can keep merge conflicts to a minimum.

git remote add upstream - the master/branch url. In this example, I have used the master itself
 ╰─$ git remote -v
origin	git@github.net:name/project.git (fetch)
origin	git@github.net:name/project.git (push)
╰─$ git remote add upstream git@github.net:name/project
╰─$ git remote -v
origin	git@github.net:name/project (fetch)
origin	git@github.net:name/project (push)
upstream	git@github.net:name/project (fetch)
upstream	git@github.net:name/project (push)
* `git fetch upstream` should now fetch the latest from your master/branch (upstream) and automatically merge in case of non-conflicts.

### Commit

Commit to your local repo and push the changes to github.

git commit -m "merged" Ensure you have clear comment of the changes you did
git push Ensure you push to github
