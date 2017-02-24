package service.impl;

import mapper.BookInfoMapper;
import mapper.BookMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import po.Book;
import po.BookInfo;
import po.BookQueryVo;
import service.BookService;

import java.util.List;

/**
 * Created by adc333 on 2017/2/16.
 */
public class BookServiceImpl implements BookService {

    //注入mapper
    @Autowired
    private BookInfoMapper bookInfoMapper;

    //注入BookMapper
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<BookInfo> findBookList(BookQueryVo bookQueryVo) throws Exception {
        return bookInfoMapper.findBookList(bookQueryVo);
    }

    @Override
    public BookInfo findBookByBookId(String bookId) throws Exception {
        Book book = bookMapper.selectByPrimaryKey(bookId);
        BookInfo bookInfo = new BookInfo();
        BeanUtils.copyProperties(book, bookInfo);
        return bookInfo;
    }

    @Override
    public void updateBook(String bookId, BookInfo bookInfo) throws Exception {

        if(bookId == null) {

        }

        bookMapper.updateByPrimaryKeyWithBLOBs(bookInfo);
    }
}
