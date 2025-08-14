FROM ubuntu:latest
LABEL authors="Adrian"

ENTRYPOINT ["top", "-b"]