package com.balab.server.actor

import akka.actor.{Actor, ActorLogging}
import com.balab.common.message.{TaskAssigned, ReceiveHeartBeat, SendHeartBeat}


class ServerActor extends Actor with ActorLogging{
  override  def receive = {

    case SendHeartBeat(msg) =>
      println("Received Heart beat : " + msg)


      println("Received Heart beat : " + sender().path.name)



      //sender() ! ReceiveHeartBeat(msg)

      //sender() ! TaskAssigned("Task assigned to client by server")

  }
}

