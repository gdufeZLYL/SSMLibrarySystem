package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import po.BookInfo;
import service.BookService;

import java.util.List;

/**
 * Created by adc333 on 2017/2/16.
 */
@Controller
@RequestMapping("/book")
public class BookController {

    //注入service
    @Autowired
    private BookService bookService;

    @RequestMapping("/queryBook")
    public ModelAndView queryBook() throws Exception {
        //调用service来查询图书列表
        List<BookInfo> bookList = bookService.findBookList(null);

        /*
        for(BookInfo bookInfo : bookList) {
            System.out.println(bookInfo.getBookName());
        }
        */

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("bookList", bookList);

        //指定逻辑视图名bookList
        modelAndView.setViewName("bookList");

        return modelAndView;
    }

    @RequestMapping(value = "/editBook", method = RequestMethod.GET)
    public String editBook(Model model, String bookId) throws Exception {
        model.addAttribute("bookId", bookId);
        BookInfo bookInfo = bookService.findBookByBookId(bookId);
        model.addAttribute("bookInfo", bookInfo);
        return "editBook";
    }

    @RequestMapping("/editBookSubmit")
    public String editBookSubmit(Model model, String bookId, @ModelAttribute(value = "bookInfo") BookInfo bookInfo) throws Exception {
        System.out.println(bookId+", "+bookInfo.getBookId());
        model.addAttribute("bookId", bookId);
        bookService.updateBook(bookId, bookInfo);
        return "editBook";
    }
}
