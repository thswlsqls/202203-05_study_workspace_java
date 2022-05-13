package com.project.servlet;

public class ActionFactory {
	//�����ڴ� �׻� ����, ��� ���� ���� ���ؼ��� private
	private ActionFactory() {}

	public static Action getAction(String cmd) {
		Action a=null;
		
		switch(cmd) {
		case "loginUI":
			a=new LoginUIAction();
			break;
		case "loginAction":
			a=new LoginAction();
			break;
		case "logoutAction":
			a=new LogoutAction();
			break;
		case "addUserUI":
			a=new AddUserUIAction();
			break;
		case "addUserAction":
			a=new AddUserAction();
			break;
	   case "bookmarkListAction":
             a=new BookmarkListAction();
             break;
	   case "boardDetailUI":
           a=new BoardDetailUIAction();
           break;
	   case "boardThemeListUI":
           a=new BoardThemeListUIAction();
           break;
	   case "checkBookmarkAction":
		   a=new CheckBookmarkAction();
		   break;
		case "checkEmotionUI":
			a=new CheckEmotionUIAction();
			break;
		case "checkEmotionAction":
			a=new CheckEmotionAction();
			break;
		case "checkGoodAction":
			a=new CheckGoodAction();
			break;
		case "checkSuggestionAction":
			a=new CheckSuggestionAction();
			break;
      case "checkIdAction":
             a=new CheckIdAction();
             break;
      case "checkPenNameAction":
             a=new CheckPenNameAction();
             break;
      case "countGoodAction":
          a=new CountGoodAction();
          break;
		case "myPageUI":
			a=new MyPageUIAction();
			break;
      case "myPageAction":
             a=new MyPageAction();
             break;
      case "mypageWriteAction":
             a=new MypageWriteAction();
             break;
		case "homeUI":
			a=new HomeUIAction();
			break;
		case "diaryWriteUI":
			a=new DiaryWriteUIAction();
			break;
		case "diaryWriteAction":
			a=new DiaryWriteAction();
			break;
		case "diaryModifyAction":
			a=new DiaryModifyAction();
			break;
		case "diaryModifyUI":
			a=new DiaryModifyUIAction();
			break;
		case "diaryDeleteAction":
			a=new DiaryDeleteAction();
			break;
		case "setShareStatusAction":
			a=new SetShareStatusAction();
			break;
		case "searchUI":
			a=new SearchUIAction();
			break;
		case "searchAction":
			a=new SearchAction();
			break;
        case "sendPwMailAction":
            a=new SendPwMailAction();
            break;
		case "sortedfriendListUI":
			a=new sortedfriendListUIAction();
			break;
		case "bookmarkAction":
			a=new BookmarkAction();
			break;
		case "bookmarkListUI":
			a=new BookmarkListUIAction();
			break;
		case "bookmarkDeleteAction":
			a=new BookmarkDeleteAction();
			break;
		case "friendFollowAction":
			a=new FriendFollowAction();
			break;
		case "friendListUI":
			a=new FriendListUIAction();
			break;
		case "friendWriteListUI":
			a=new FriendWriteListUIAction();
			break;
		case "goodDeleteAction":
			a=new GoodDeleteAction();
			break;
		case "goodAddAction":
			a=new GoodAddAction();
			break;
        case "getEmotionsAction":
            a=new GetEmotionsAction();
            break;
		case "findUserUI":
			a=new FindUserUIAction();
			break;
		case "findId":
			a=new FindIdAction();
			break;
		case "findPw":
			a=new FindPwAction();
			break;
		case "insertEmpathy":
	         a=new InsertEmpathyAction();
	         break;
		case "trendUI":
			a=new TrendUIAction();
			break;
		case "TrendAction":
			a=new TrendAction();
			break;
		case "rankingUI":
			a=new RankingUIAction();
			break;
		case "rankingAction":
			a=new RankingAction();
			break;
		case "refreshSuggestionAction":
			a=new RefreshSuggestionAction();
			break;
		 case "refreshEmotionAction":
	         a=new RefreshEmotionAction();
	         break;
		case "newListUI":
			a=new NewListUIAction();
			break;    
		case "bookmarkListUI2":
	         a=new BookmarkListUI2Action();
	        break;  


		default :
			a=new MainAction();  //���ų� �𸣴� cmd���� ���			
		}	
		
		return a;
	}

}
