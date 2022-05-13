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
	
//	@Test
//	public void getFriendWriteListTest() {
//		try {
//			assertNotNull(wDao.getFriendWriteList("test2"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	@Test
//	public void isReactedTest() {
//		try {
//			assertTrue(iDao.isReacted("test1", "1"));
//			assertFalse(iDao.isReacted("test1", "2"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
//	@Test
//	public void addUserTest() {
//		try {
//			assertTrue(uDao.addUser("test6", "�׽�Ʈ6", "�׽�Ʈ6", "1234", "rkacskrl@naver.com", "01011112222"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Test
//	public void loginTest() {
//		try {
//			assertNotNull(uDao.login("test6", "1234"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}	
//	@Test
//	public void findIdTest() {
//		try {
//			assertNotNull(uDao.findId("�׽�Ʈ5", "rkacskrl@naver.com"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}	
//	@Test
//	public void diaryWriteTest() {
//		try {
//			assertTrue(wDao.diaryWrite("JUnit ���ۼ� �׽�Ʈ", "test5", "813"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Test
//	public void diaryModifyTest() {
//		try {
//			assertTrue(wDao.diaryModify("test5", "8", "�԰����ְ���?"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Test
//	public void diaryRemoveTest() {
//		try {
//			assertTrue(wDao.diaryRemove("test5", "9"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//		//���� ��ȣ�� �˻��ص� �� �ڵ忡 ���� ���� ���⶧���� null�� ǥ�õǱ⋚���� 
//	@Test//���� ��ȣ�� �־ ���࿡ ������ ����.
//	public void getHomeBoardListTest() {
//		try {
//			assertNotNull(wDao.getHomeBoardList("110"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Test
//	public void setShareStatusTest() {
//		try {
//			assertTrue(wDao.setShareStatus("����", "3", "test1"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	@Test
//	public void getNewBoardListTest() {
//		try {
//			assertNotNull(wDao.getNewBoardList());
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	@Test
//	public void getNowRecommendedBoardListTest() {
//		try {
//			assertNotNull(wDao.getNowRecommendedBoardList());
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	//InteractionDAO
//	@Test //���ã�� �� ��� ��ȸ
//	public void getBookmarkListTest() {
//		try {
//			assertNotNull(iDao.getBookmarkList("test1"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Test //���ã�� �� �߰�
//	public void addBookmarkTest() {
//		try {
//			assertTrue(iDao.addBookmark("test1", "4"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Test //���ã�� �� ����
//	public void deleteBookmarkTest() {
//		try {
//			assertTrue(iDao.deleteBookmark("test1", "4"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Test //���ã�� �� ����ȸ
//	public void getBookmarkWriteTest() {
//		try {
//			assertNotNull(iDao.getBookmarkWrite("110"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Test //�ȷο�(ģ���߰�)
//	public void addFollowTest() {
//		try {
//			assertTrue(iDao.addFollow("test3", "test2"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Test //�ȷο�(�����ȸ)
//	public void getFollowListTest() {
//		try {
//			assertNotNull(iDao.getFollowList("test1"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Test //���ƿ� �߰�
//	public void addReactionTest() {
//		try {
//			assertTrue(iDao.addReaction("test2", "1"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Test //���ƿ� ����
//	public void deleteReactionTest() {
//		try {
//			assertTrue(iDao.deleteReaction("test1", "5"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	//EmotionDAO
//	@Test//���� 8�� ����
//	public void getEmotionNameTest() {
//		try {
//			assertNotNull(eDao.getEmotionName());
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Test//���� ����
//	public void addEmpathyTest() {
//		try {
//			assertTrue(eDao.addEmpathy("test2", "220"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Test//���� Ʈ���� ��ȸ
//	public void getTrendEmotionTest() {
//		try {
//			assertNotNull(eDao.getTrendEmotion());
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Test//Ʈ���� �� ����ȸ
//	public void getTrendWriteTest() {
//		try {
//			assertNotNull(eDao.getTrendWrite("110"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Test//���þ� ����
//	public void selectSuggestionTest() {
//		try {
//			assertNotNull(eDao.selectSuggestion("test1"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Test
//	public void getBookmarkedWriteTest() {
//		try {
//			assertNotNull(iDao.getBookmarkedWrite("test1", "1"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Test
//	public void getBookmarkedWriteListTest() {
//		try {
//			assertNotNull(iDao.getBookmarkedWriteList("test1"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Test
//	public void searchByPenNameTest() {
//		try {
//			assertNotNull(wDao.searchByPenName("pen_test1", "22/05/10"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Test
//	public void searchBySuggestionNameTest() {
//		try {
//			assertNotNull(wDao.searchBySuggestionName("���", "22/05/10"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Test
//	public void getHomeBoardListTest() {
//		try {
//			assertNotNull(wDao.getHomeBoardList("110"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Test
//	public void getNewBoardListTest() {
//		try {
//			assertNotNull(wDao.getNewBoardList());
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Test
//	public void getNowRecommendedBoardListTest() {
//		try {
//			assertNotNull(wDao.getNowRecommendedBoardList());
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Test
//	public void getFriendWriteListTest() {
//		try {
//			assertNotNull(wDao.getFriendWriteList("test1"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Test
//	public void getTrendWriteTest() {
//		try {
//			assertNotNull(wDao.getTrendWrite("110"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	@Test
//	public void getWriteDetailTest() {
//		try {
//			assertNotNull(wDao.getWriteDetail("1"));
//			assertNull(wDao.getWriteDetail("100"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

//	@Test
//	public void isBookmarkedTest() {
//		try {
//			assertTrue(iDao.isBookmarked("test1", "1"));
//			assertFalse(iDao.isBookmarked("test1", "12"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
	
//	@Test
//	public void countReactionsTest() {
//		try {
//			assertTrue(iDao.countReactions("1") == 2);
//			assertTrue(iDao.countReactions("6") == 1);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
	
//	@Test
//	public void addBookmarkTest() {
//		try {
//			assertTrue(iDao.addBookmark("test1", "2"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	@Test
	public void getFollowListTest() {
		try {
			assertNotNull(iDao.getFollowList("test2"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}



























