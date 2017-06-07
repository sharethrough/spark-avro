resolvers += Resolver.url("artifactory", url("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

resolvers += "Spark Package Main Repo" at "https://dl.bintray.com/spark-packages/maven"

addSbtPlugin("org.spark-packages" % "sbt-spark-package" % "0.2.3")

resolvers += Resolver.url("libs-release-local", url(sys.env("ARTIFACTORY_URL")))(Resolver.ivyStylePatterns)

credentials += Credentials(
  sys.env("MAVEN_REALM"),
  sys.env("MAVEN_HOST"),
  sys.env("MAVEN_USER"),
  sys.env("MAVEN_PASSWORD")
)

addSbtPlugin("com.sharethrough" %% "sbt-base-settings" % "1.0.31")
