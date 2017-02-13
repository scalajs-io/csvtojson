package io.scalajs.npm

import io.scalajs.nodejs.stream.Readable

import scala.scalajs.js

/**
  * csvtojson package object
  * @author lawrence.daniels@gmail.com
  */
package object csvtojson {

  /**
    * CsvToJson Events
    * @param readable the given [[Readable readable]]
    */
  implicit class CsvToJsonEvents(val readable: Readable) extends AnyVal {

    @inline
    def onCsv(handler: js.Array[String] => Any): readable.type = readable.on("csv", handler)

    @inline
    def onDone(handler: () => Any): readable.type = readable.on("done", handler)

    @inline
    def onJson(handler: js.Any => Any): readable.type = readable.on("json", handler)

  }

}
