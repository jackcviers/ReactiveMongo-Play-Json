resolvers ++= Seq(
  "Tatami Releases" at "https://raw.github.com/cchantep/tatami/master/releases")

addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.5.0")

addSbtPlugin("cchantep" % "sbt-hl-compiler" % "0.2")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.0")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.8.2")

addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.1.8")

addSbtPlugin("de.johoop" % "findbugs4sbt" % "1.4.0")
