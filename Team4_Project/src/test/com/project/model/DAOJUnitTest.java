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
	public static void 테스트_시작() {
		System.out.println("테스트 시작");
		uDao = new UserDAO();
		wDao = new WriterDAO();
		
		iDao = new InteractionDAO();
		eDao = new EmotionDAO();
	}
	
	@Before
	public void startUnitTest(){
		System.out.println("단위테스트 시작");
	}
	
	@Test
	public void addUserTest() {
		try {
			assertTrue(uDao.addUser("test6", "테스트6", "테스터6", "1234", "rkacskrl@naver.com", "01011112222"));
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
			assertNotNull(uDao.findId("테스트5", "rkacskrl@naver.com"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	@Test
	public void diaryWriteTest() {
		try {
			assertTrue(wDao.diaryWrite("오늘은 그래도 살만한거같다.", "test5", "813"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void diaryModifyTest() {
		try {
			assertTrue(wDao.diaryModify("test5", "8", "먹고살수있겠지?"));
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
	
		//없는 번호를 검색해도 그 코드에 대한 글이 없기때문에 null로 표시되기떄문에 
	@Test//없는 번호를 넣어도 실행에 문제는 없다.
	public void getHomeBoardListTest() {
		assertNotNull(wDao.getHomeBoardList("110"));
	}
	@Test
	public void setShareStatusTest() {
		try {
			assertTrue(wDao.setShareStatus("공유", "3", "test1"));
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
	@Test //즐겨찾기 글 목록 조회
	public void getBookmarkListTest() {
		try {
			assertNotNull(iDao.getBookmarkList("test1"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test //즐겨찾기 글 추가
	public void addBookmarkTest() {
		try {
			assertTrue(iDao.addBookmark("test1", "4"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test //즐겨찾기 글 삭제
	public void deleteBookmarkTest() {
		try {
			assertTrue(iDao.deleteBookmark("test1", "4"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test //즐겨찾기 글 상세조회
	public void getBookmarkWriteTest() {
		try {
			assertNotNull(iDao.getBookmarkWrite("110"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test //팔로우(친구추가)
	public void addFollowTest() {
		try {
			assertTrue(iDao.addFollow("test3", "test2"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test //팔로우(목록조회)
	public void getFollowListTest() {
		try {
			assertNotNull(iDao.getFollowList("test1"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test //좋아요 추가
	public void addReactionTest() {
		try {
			assertTrue(iDao.addReaction("test2", "1"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test //좋아요 삭제
	public void deleteReactionTest() {
		try {
			assertTrue(iDao.deleteReaction("test1", "5"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//EmotionDAO
	@Test//감정 8개 추출
	public void getEmotionNameTest() {
		try {
			assertNotNull(eDao.getEmotionName());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test//감정 선택
	public void addEmpathyTest() {
		try {
			assertTrue(eDao.addEmpathy("test2", "220"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test//감정 트렌드 조회
	public void getTrendEmotionTest() {
		try {
			assertNotNull(eDao.getTrendEmotion());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test//트렌드 글 상세조회
	public void getTrendWriteTest() {
		try {
			assertNotNull(eDao.getTrendWrite("110"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test//제시어 선택
	public void selectSuggestionTest() {
		try {
			assertNotNull(eDao.selectSuggestion("test1"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}



























