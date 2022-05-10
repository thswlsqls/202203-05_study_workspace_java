package test.com.project.model;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.project.model.EmotionDAO;
import com.project.model.InteractionDAO;
import com.project.model.UserDAO;
import com.project.model.WriterDAO;

public class DAOJUnitTest {
	static WriterDAO wDao;
	static UserDAO uDao;
	
	static InteractionDAO iDao;
	static EmotionDAO eDao;
	
	
	@BeforeClass
	public static void �׽�Ʈ_����() {
		System.out.println("�׽�Ʈ ����");
		uDao = new UserDAO();
		wDao = new WriterDAO();
		
		iDao = new InteractionDAO();
		eDao = new EmotionDAO();
	}
	
	@Before
	public void startUnitTest(){
		System.out.println("�����׽�Ʈ ����");
	}
	
	@Test
	public void addUserTest() {
		try {
			assertTrue(uDao.addUser("test6", "�׽�Ʈ6", "�׽���6", "1234", "rkacskrl@naver.com", "01011112222"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void loginTest() {
		try {
			assertNotNull(uDao.login("test5", "1234"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	@Test
	public void findIdTest() {
		try {
			assertNotNull(uDao.findId("�׽�Ʈ5", "rkacskrl@naver.com"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	@Test
	public void diaryWriteTest() {
		try {
			assertTrue(wDao.diaryWrite("������ �׷��� �츸�ѰŰ���.", "test5", "813"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void diaryModifyTest() {
		try {
			assertTrue(wDao.diaryModify("test5", "8", "�԰����ְ���?"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void diaryRemoveTest() {
		try {
			assertTrue(wDao.diaryRemove("test5", "9"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		//���� ��ȣ�� �˻��ص� �� �ڵ忡 ���� ���� ���⶧���� null�� ǥ�õǱ⋚���� 
	@Test//���� ��ȣ�� �־ ���࿡ ������ ����.
	public void getHomeBoardListTest() {
		assertNotNull(wDao.getHomeBoardList("110"));
	}
	@Test
	public void setShareStatusTest() {
		try {
			assertTrue(wDao.setShareStatus("����", "3", "test1"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void getNewBoardListTest() {
		assertNotNull(wDao.getNewBoardList());
	}
	
	@Test
	public void getNowRecommendedBoardListTest() {
		assertNotNull(wDao.getNowRecommendedBoardList());
	}
	
	//InteractionDAO
	@Test //���ã�� �� ��� ��ȸ
	public void getBookmarkListTest() {
		try {
			assertNotNull(iDao.getBookmarkList("test1"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test //���ã�� �� �߰�
	public void addBookmarkTest() {
		try {
			assertTrue(iDao.addBookmark("test1", "4"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test //���ã�� �� ����
	public void deleteBookmarkTest() {
		try {
			assertTrue(iDao.deleteBookmark("test1", "4"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test //���ã�� �� ����ȸ
	public void getBookmarkWriteTest() {
		try {
			assertNotNull(iDao.getBookmarkWrite("110"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test //�ȷο�(ģ���߰�)
	public void addFollowTest() {
		try {
			assertTrue(iDao.addFollow("test3", "test2"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test //�ȷο�(�����ȸ)
	public void getFollowListTest() {
		try {
			assertNotNull(iDao.getFollowList("test1"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test //���ƿ� �߰�
	public void addReactionTest() {
		try {
			assertTrue(iDao.addReaction("test2", "1"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test //���ƿ� ����
	public void deleteReactionTest() {
		try {
			assertTrue(iDao.deleteReaction("test1", "5"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//EmotionDAO
	@Test//���� 8�� ����
	public void getEmotionNameTest() {
		try {
			assertNotNull(eDao.getEmotionName());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test//���� ����
	public void addEmpathyTest() {
		try {
			assertTrue(eDao.addEmpathy("test2", "220"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test//���� Ʈ���� ��ȸ
	public void getTrendEmotionTest() {
		try {
			assertNotNull(eDao.getTrendEmotion());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test//Ʈ���� �� ����ȸ
	public void getTrendWriteTest() {
		try {
			assertNotNull(eDao.getTrendWrite("110"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test//���þ� ����
	public void selectSuggestionTest() {
		try {
			assertNotNull(eDao.selectSuggestion("test1"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}



























