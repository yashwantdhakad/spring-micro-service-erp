#!/bin/sh

DIR="$(dirname "$0")"
MVNW_REPOURL="https://repo.maven.apache.org/maven2"

if command -v mvn >/dev/null 2>&1; then
  exec mvn "$@"
else
  echo "Apache Maven is required to build this project." >&2
  echo "Please install Maven or adapt mvnw to download it automatically." >&2
  exit 1
fi
