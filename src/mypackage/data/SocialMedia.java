package mypackage.data;

class SocialMedia {
}

class Facebook extends SocialMedia{
    final void login(String username, String password){
        // isi method
    }
}

class FakeFacebook extends Facebook{
//    error
//    void login(String username, String password) {
//        super.login(username, password);
//    }
}