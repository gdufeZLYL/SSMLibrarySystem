package mapper;

import po.BookInfo;
import po.BookQueryVo;

import java.util.List;

/**
 * Created by adc333 on 2017/2/16.
 */
public interface BookInfoMapper {
    //图书查询列表
    List<BookInfo> findBookList(BookQueryVo bookQueryVo) throws Exception ;

}
