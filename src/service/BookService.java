package service;

import po.BookInfo;
import po.BookQueryVo;

import java.util.List;

/**
 * Created by adc333 on 2017/2/16.
 */
public interface BookService {
    //图书查询列表
    List<BookInfo> findBookList(BookQueryVo bookQueryVo) throws Exception ;

    //根据图书bookId查询图书信息
    public BookInfo findBookByBookId(String bookId) throws Exception ;

    //更新图书信息
    public void updateBook(String bookId, BookInfo bookInfo) throws Exception ;
}
