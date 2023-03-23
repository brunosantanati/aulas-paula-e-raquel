# Anotações úteis

## Links
[Vídeo sobre pre-commit](https://www.youtube.com/watch?v=psjz6rwzMdk)  
[Repo mirrors-prettier](https://github.com/pre-commit/mirrors-prettier)  
[Repo prettier](https://github.com/prettier/prettier)  
[Repo prettier-java](https://github.com/jhipster/prettier-java)  

## Comandos relacionados ao pre-commit e prettier
```
PRE_COMMIT_ALLOW_NO_CONFIG=1 git commit -m "Commit message"

sudo apt install python3-pip
pip install pre-commit
pre-commit --version
pre-commit install
pre-commit run --all-files
pre-commit run --all-files --verbose
pre-commit run --files primeira-aula/src/**/*.java
pre-commit clean
pip install --upgrade pre-commit
pre-commit autoupdate
pre-commit migrate-config
pre-commit run --debug

pre-commit uninstall
pip uninstall pre-commit
sudo apt-get remove python3-pip

sudo npm install --global prettier
sudo npm install --global prettier@2.7.1
sudo npm install -g prettier prettier-plugin-java
npm list -g prettier-plugin-java
npm config get registry
npm cache clean --force
prettier --version
prettier --write /path/to/your/file.java
prettier --list-different /path/to/your/file.java
```
