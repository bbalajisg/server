package com.balab.akka.server

import akka.actor.{Props, ActorSystem}
import com.balab.server.actor.ServerActor
import com.typesafe.config.ConfigFactory

/**
 * Created by dev-env on 17/1/15.
 */
object SeverApplication {

  def main(args: Array[String]): Unit = {

      startRemoteWorkerSystem()
  }

  def startRemoteWorkerSystem(): Unit = {
    val system  = ActorSystem("ServerActorSystem", ConfigFactory.load("server"))
    val serverActor = system.actorOf(Props[ServerActor], "serverActor")

    serverActor ! "Listening..."

    println("Started Server....")

  }
}
