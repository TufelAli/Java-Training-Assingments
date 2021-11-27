package service;

import java.util.ArrayList;

import bean.Element;

public interface ElementService {

	ArrayList<Element> searchAllElement();
	Element searchElementByName(String ename);
	boolean insertElement(Element element);
	boolean removeElement(String ename);
	boolean updateElementByName(String weight,String ename);

}
