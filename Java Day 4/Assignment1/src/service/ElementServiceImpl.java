package service;

import java.util.ArrayList;

import bean.Element;
import persistence.ElementDao;
import persistence.ElementDaoImpl;

public class ElementServiceImpl implements ElementService {

	private ElementDao elementDao=new ElementDaoImpl();
	
	@Override
	public ArrayList<Element> searchAllElement() {
		return elementDao.getAllElements();
	}

	@Override
	public Element searchElementByName(String ename) {
		return elementDao.getElementByName(ename);
	}

	@Override
	public boolean insertElement(Element element) {
		int rows=elementDao.addElement(element);
		if(rows>0)
			return true;
		return false;
	}

	@Override
	public boolean removeElement(String ename) {
		int rows=elementDao.deleteElement(ename);
		if(rows>0)
			return true;
		return false;
	}

	@Override
	public boolean updateElementByName(String empId, String salary) {
		int rows=elementDao.updateElement(empId, salary);
		if(rows>0)
			return true;
		return false;
	}

}

