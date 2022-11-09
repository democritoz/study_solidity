# See here for image contents: https://github.com/microsoft/vscode-dev-containers/tree/v0.245.2/containers/ubuntu/.devcontainer/base.Dockerfile

# [Choice] Ubuntu version (use ubuntu-22.04 or ubuntu-18.04 on local arm64/Apple Silicon): ubuntu-22.04, ubuntu-20.04, ubuntu-18.04
ARG VARIANT="jammy"
FROM mcr.microsoft.com/vscode/devcontainers/base:0-${VARIANT}

# [Optional] Uncomment this section to install additional OS packages.
# RUN apt-get update && export DEBIAN_FRONTEND=noninteractive \
#     && apt-get -y install --no-install-recommends <your-package-list-here>


RUN sudo apt-get update
RUN sudo apt-get -y upgrade
RUN sudo curl -sL https://deb.nodesource.com/setup_14.x | sudo -E bash -
RUN sudo apt-get -y install nodejs
RUN sudo apt-get update
# RUN sudo apt-get -y install npm
RUN sudo npm install -g truffle
RUN sudo npm install -g ganache


# Install JDK
RUN sudo apt-get install -y openjdk-17-jdk


# Install web3j
# RUN curl -L get.web3j.io | sh && source ~/.web3j/source.sh
