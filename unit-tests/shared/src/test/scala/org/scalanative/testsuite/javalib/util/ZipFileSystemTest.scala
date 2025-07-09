package org.scalanative.testsuite.javalib.util

import java.{lang => jl}

import java.util._
import java.nio.file.FileSystems
import java.net.URI

import org.junit._
import org.junit.Assert._
import org.scalanative.testsuite.utils.Platform.executingInJVM

class ZipFileSystemTest {
  @Test def loadZipFileSystem(): Unit = {
    val map = new HashMap[String, Object]()
    val fs = FileSystems.newFileSystem(URI("jar:/blablabla"), map)

    assertTrue(fs.provider.getScheme == "jar")
  }
}
