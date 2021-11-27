package persistence;

import java.util.ArrayList;

import bean.Element;

public interface ElementDao {

	ArrayList<Element> getAllElements();
	Element getElementByName(String ename);
	int addElement(Element element);
	int deleteElement(String ename);
	int updateElement(String w,String e);
}
