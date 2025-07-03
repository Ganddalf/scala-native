package scala.scalanative.nio.fs.zipfs

import scala.scalanative.nio.fs.GenericFileSystemProvider
import java.nio.file.AccessMode
import java.nio.file.attribute.FileAttributeView
import java.{util => ju}
import java.nio.file.LinkOption
import java.util.{LinkedList, List, Map, Set}
import java.nio.file.CopyOption
import java.nio.file.OpenOption
import java.nio.file.FileSystem
import java.nio.file.FileStore
import java.nio.file.attribute.FileAttribute
import java.nio.channels.SeekableByteChannel
import java.nio.file.Path
import java.nio.file.attribute.BasicFileAttributes
import scala.collection.immutable.{Map => SMap}
import java.nio.file.spi.FileSystemProvider
import java.nio.file.DirectoryStream
import java.nio.file.DirectoryStream.Filter
import java.net.URI

class ZipFileSystemProvider extends FileSystemProvider {

  override def getScheme(): String = ???

  override def newFileSystem(uri: URI, env: Map[String, _]): FileSystem = ???

  override def getFileSystem(uri: URI): FileSystem = ???

  override def getPath(uri: URI): Path = ???

  override def newDirectoryStream(
      dir: Path,
      filter: DirectoryStream.Filter[_ >: Path]
  ): DirectoryStream[Path] = ???

  override def createDirectory(
      dir: Path,
      attrs: Array[FileAttribute[_]]
  ): Unit = ???

  override def delete(path: Path): Unit = ???

  override def copy(
      source: Path,
      target: Path,
      options: Array[CopyOption]
  ): Unit = ???

  override def move(
      source: Path,
      target: Path,
      options: Array[CopyOption]
  ): Unit = ???

  override def isSameFile(path: Path, path2: Path): Boolean = ???

  override def isHidden(path: Path): Boolean = ???

  override def checkAccess(path: Path, modes: Array[AccessMode]): Unit = ???

  override def getFileAttributeView[V <: FileAttributeView](
      path: Path,
      tpe: Class[V],
      options: Array[LinkOption]
  ): V = ???

  override def readAttributes[A <: BasicFileAttributes](
      path: Path,
      tpe: Class[A],
      options: Array[LinkOption]
  ): A = ???

  override def readAttributes(
      path: Path,
      attributes: String,
      options: Array[LinkOption]
  ): Map[String, Object] = ???

  override def setAttribute(
      path: Path,
      attribute: String,
      value: Object,
      options: Array[LinkOption]
  ): Unit = ???

}
