package customTag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class CustomTag implements Tag{
	PageContext context=null;
	@Override
	public void setPageContext(PageContext context) {
		// TODO Auto-generated method stub
		this.context=context;
		
	}



	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		return EVAL_PAGE;
	}

	@Override
	public int doStartTag() throws JspException {
		JspWriter writer=context.getOut();
		try {
			writer.println("This is the custom tag first application!");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		return EVAL_BODY_INCLUDE;
	}

	@Override
	public Tag getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void release() {
		// TODO Auto-generated method stub
		
	}

		@Override
	public void setParent(Tag arg0) {
		// TODO Auto-generated method stub
		
	}

}
