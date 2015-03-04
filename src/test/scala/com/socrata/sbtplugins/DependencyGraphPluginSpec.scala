package com.socrata.sbtplugins

import com.socrata.sbtplugins.DependencyGraphPlugin._
import org.scalatest.{FunSuiteLike, Matchers}
import sbt._

class DependencyGraphPluginSpec extends FunSuiteLike with Matchers {
   test("triggers on all requirements") {
     trigger should equal(AllRequirements)
   }

   test("depends on jvm plugin") {
     requires should equal(plugins.JvmPlugin)
   }

   test("has project settings") {
     projectSettings.isEmpty should equal(false)
   }
 }
