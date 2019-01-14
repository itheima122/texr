package com.itheima.lucene;

import org.apache.commons.io.FileUtils;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

import java.io.File;
import java.io.IOException;

public class LuceneFirst {
     public void createIndex() throws IOException {
         //1、创建一个Director对象，指定索引库保存的位置。
         //把索引库保存在磁盘
         Directory directory = FSDirectory.open(new File("E:\\temp\\index").toPath());
         //2、基于Directory对象创建一个IndexWriter对象
         IndexWriter indexWriter = new IndexWriter(directory, new IndexWriterConfig());
         //3、读取磁盘上的文件，对应每个文件创建一个文档对象。
         File dir = new File("D:\\java资料\\就业班\\新建文件夹\\lucene\\资料\\searchsource");
         File[] files = dir.listFiles();
         for (File f:files) {
             //取文件名
             String fileName = f.getName();
             //文件的路径
             String filePath = f.getPath();
             //文件的内容
             String fileContent = FileUtils.readFileToString(f, "utf-8");
             //文件的大小
             long fileSize = FileUtils.sizeOf(f);

         }
         //4、向文档对象中添加域
         //5、把文档对象写入索引库
         //6、关闭indexwriter对象
     }
}
