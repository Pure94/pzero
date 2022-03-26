FROM gradle:7.4.1-jdk11 as builder

COPY . /build/
WORKDIR /build
RUN gradle bootJar

FROM openjdk:11

COPY --from=builder /build/libs/pzero-0.0.1-SNAPSHOT.jar ./app.jar