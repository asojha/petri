package com.wixpress.petri.laboratory

import java.util.UUID

import com.wixpress.petri.experiments.domain.{TestGroup, Experiment}

/**
 * Created by talyag on 5/13/15.
 */
trait ConductionStrategy {
  /*
  use None if you do not want persistence (cookies etc.)
  otherwise define the key (normally the same as used for conduction)
   */
  def persistentKernel(): Option[UUID]
  def shouldPersist(): Boolean = persistentKernel().isDefined
  def drawTestGroup(exp: Experiment): TestGroup
}

