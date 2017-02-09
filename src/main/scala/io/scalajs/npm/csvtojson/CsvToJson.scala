package io.scalajs.npm.csvtojson

import io.scalajs.nodejs.stream.Readable

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

/**
  * csvtojson - A tool concentrating on converting csv data to JSON with customised parser supporting
  * @author lawrence.daniels@gmail.com
  */
@js.native
trait CsvToJson extends js.Object {

  def apply(options: ParsingOptions): Unit = js.native

}

/**
  * Csvtojson Singleton
  * @author lawrence.daniels@gmail.com
  */
@js.native
@JSImport("csvtojson", JSImport.Namespace)
object CsvToJson extends js.Object

/**
  * CSV Parsing Options
  */
@ScalaJSDefined
class ParsingOptions extends js.Object