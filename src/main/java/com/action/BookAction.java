package com.action;

import com.model.BookInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.DecimalFormat;
import java.util.List;

public class BookAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    @Autowired
    private IBookService bookService;

    @Override
    public String execute() throws Exception {
        List<BookInfo> list = bookService.getlist();
        ActionContext actionContext = ActionContext.getContext();
        actionContext.put("bookList", list);

        return "list";
    }

    /**
     * 金额格式转换
     * @param s
     * @return
     */
    public String formatDouble(double s) {
        DecimalFormat format = new DecimalFormat("\u00A4##.0");
        return format.format(s);
    }
}
