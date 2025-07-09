package scala.scalanative.nio.fs.zipfs

import java.nio.file.spi.FileSystemProvider
import java.nio.file.FileSystem
import java.nio.file.Path
import java.util.LinkedList
import java.nio.file.WatchService
import java.nio.file.PathMatcher
import java.{util => ju}
import java.nio.file.attribute.UserPrincipalLookupService
import java.nio.file.FileStore

class ZipFileSystem(fsProvider: FileSystemProvider) extends FileSystem {

  override def newWatchService(): WatchService = ???

  override def getPath(first: String, more: Array[String]): Path = ???

  override def close(): Unit = ???

  override def getPathMatcher(syntaxAndPattern: String): PathMatcher = ???

  override def isReadOnly(): Boolean = ???

  override def getRootDirectories(): java.lang.Iterable[Path] = ???

  override def getUserPrincipalLookupService(): UserPrincipalLookupService = ???

  override def provider(): FileSystemProvider = fsProvider

  override def getFileStores(): java.lang.Iterable[FileStore] = ???

  override def supportedFileAttributeViews(): ju.Set[String] = ???

  override def isOpen(): Boolean = ???

  override def getSeparator(): String = ???

}
