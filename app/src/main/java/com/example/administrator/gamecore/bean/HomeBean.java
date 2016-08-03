package com.example.administrator.gamecore.bean;

import java.util.List;

/*
* 类描述：   
* 创建人：Administrator glf  
* 创建时间：2016/8/3 15:46   
*/
public class HomeBean {
    /**
     * status : 1
     * results : [{"type":"original","data":{"id":19977,"type":"Article","title":"一个注定会死的游戏能让你感受出什么？","desc":"\"灭绝是不变的规律，生存则是例外\" - 卡尔 萨根","thumb_url":"http://alioss.g-cores.com/uploads/article/bb2c11fc-c0bb-43b6-bb1e-f7852dd31a91_hsat2x.png","cover_url":"http://alioss.g-cores.com/uploads/article/bbedb0d0-8255-493b-a187-a7b35eaec640.png","permalink":"http://www.g-cores.com/originals/19977","vol":null,"likes_num":46,"comments_num":22,"created_at":"2016-08-01 06:00:05","user":{"id":34012,"nickname":"beenoera","thumb_url":"http://alioss.g-cores.com/uploads/user/890b30a7-8972-4d92-a7db-1b18567e8041_normal.png","location":"广州","is_fresh":false},"category":{"id":18,"name":"安利大帝","desc":"","show_name":"安利大帝","type":"Column","specific_type":"article","logo_url":"http://alioss.g-cores.com/uploads/column/f60fa57f-4cdc-4495-809e-4cad83a5a336.png","background_url":"http://alioss.g-cores.com/uploads/column/dce17a31-fbb8-4e3f-87e4-e330aafc51de.jpg","subscriptors_num":971}}}]
     */

    private int status;
    /**
     * type : original
     * data : {"id":19977,"type":"Article","title":"一个注定会死的游戏能让你感受出什么？","desc":"\"灭绝是不变的规律，生存则是例外\" - 卡尔 萨根","thumb_url":"http://alioss.g-cores.com/uploads/article/bb2c11fc-c0bb-43b6-bb1e-f7852dd31a91_hsat2x.png","cover_url":"http://alioss.g-cores.com/uploads/article/bbedb0d0-8255-493b-a187-a7b35eaec640.png","permalink":"http://www.g-cores.com/originals/19977","vol":null,"likes_num":46,"comments_num":22,"created_at":"2016-08-01 06:00:05","user":{"id":34012,"nickname":"beenoera","thumb_url":"http://alioss.g-cores.com/uploads/user/890b30a7-8972-4d92-a7db-1b18567e8041_normal.png","location":"广州","is_fresh":false},"category":{"id":18,"name":"安利大帝","desc":"","show_name":"安利大帝","type":"Column","specific_type":"article","logo_url":"http://alioss.g-cores.com/uploads/column/f60fa57f-4cdc-4495-809e-4cad83a5a336.png","background_url":"http://alioss.g-cores.com/uploads/column/dce17a31-fbb8-4e3f-87e4-e330aafc51de.jpg","subscriptors_num":971}}
     */

    private List<ResultsBean> results;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "HomeBean{" +
                "status=" + status +
                ", results=" + results +
                '}';
    }

    public static class ResultsBean {
        private String type;
        /**
         * id : 19977
         * type : Article
         * title : 一个注定会死的游戏能让你感受出什么？
         * desc : "灭绝是不变的规律，生存则是例外" - 卡尔 萨根
         * thumb_url : http://alioss.g-cores.com/uploads/article/bb2c11fc-c0bb-43b6-bb1e-f7852dd31a91_hsat2x.png
         * cover_url : http://alioss.g-cores.com/uploads/article/bbedb0d0-8255-493b-a187-a7b35eaec640.png
         * permalink : http://www.g-cores.com/originals/19977
         * vol : null
         * likes_num : 46
         * comments_num : 22
         * created_at : 2016-08-01 06:00:05
         * user : {"id":34012,"nickname":"beenoera","thumb_url":"http://alioss.g-cores.com/uploads/user/890b30a7-8972-4d92-a7db-1b18567e8041_normal.png","location":"广州","is_fresh":false}
         * category : {"id":18,"name":"安利大帝","desc":"","show_name":"安利大帝","type":"Column","specific_type":"article","logo_url":"http://alioss.g-cores.com/uploads/column/f60fa57f-4cdc-4495-809e-4cad83a5a336.png","background_url":"http://alioss.g-cores.com/uploads/column/dce17a31-fbb8-4e3f-87e4-e330aafc51de.jpg","subscriptors_num":971}
         */

        private DataBean data;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "ResultsBean{" +
                    "type='" + type + '\'' +
                    ", data=" + data +
                    '}';
        }

        public static class DataBean {
            private int id;
            private String type;
            private String title;
            private String desc;
            private String thumb_url;
            private String cover_url;
            private String permalink;
            private Object vol;
            private int likes_num;
            private int comments_num;
            private String created_at;
            /**
             * id : 34012
             * nickname : beenoera
             * thumb_url : http://alioss.g-cores.com/uploads/user/890b30a7-8972-4d92-a7db-1b18567e8041_normal.png
             * location : 广州
             * is_fresh : false
             */

            private UserBean user;
            /**
             * id : 18
             * name : 安利大帝
             * desc :
             * show_name : 安利大帝
             * type : Column
             * specific_type : article
             * logo_url : http://alioss.g-cores.com/uploads/column/f60fa57f-4cdc-4495-809e-4cad83a5a336.png
             * background_url : http://alioss.g-cores.com/uploads/column/dce17a31-fbb8-4e3f-87e4-e330aafc51de.jpg
             * subscriptors_num : 971
             */

            private CategoryBean category;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getThumb_url() {
                return thumb_url;
            }

            public void setThumb_url(String thumb_url) {
                this.thumb_url = thumb_url;
            }

            public String getCover_url() {
                return cover_url;
            }

            public void setCover_url(String cover_url) {
                this.cover_url = cover_url;
            }

            public String getPermalink() {
                return permalink;
            }

            public void setPermalink(String permalink) {
                this.permalink = permalink;
            }

            public Object getVol() {
                return vol;
            }

            public void setVol(Object vol) {
                this.vol = vol;
            }

            public int getLikes_num() {
                return likes_num;
            }

            public void setLikes_num(int likes_num) {
                this.likes_num = likes_num;
            }

            public int getComments_num() {
                return comments_num;
            }

            public void setComments_num(int comments_num) {
                this.comments_num = comments_num;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public UserBean getUser() {
                return user;
            }

            public void setUser(UserBean user) {
                this.user = user;
            }

            public CategoryBean getCategory() {
                return category;
            }

            public void setCategory(CategoryBean category) {
                this.category = category;
            }

            @Override
            public String toString() {
                return "DataBean{" +
                        "id=" + id +
                        ", type='" + type + '\'' +
                        ", title='" + title + '\'' +
                        ", desc='" + desc + '\'' +
                        ", thumb_url='" + thumb_url + '\'' +
                        ", cover_url='" + cover_url + '\'' +
                        ", permalink='" + permalink + '\'' +
                        ", vol=" + vol +
                        ", likes_num=" + likes_num +
                        ", comments_num=" + comments_num +
                        ", created_at='" + created_at + '\'' +
                        ", user=" + user +
                        ", category=" + category +
                        '}';
            }

            public static class UserBean {
                private int id;
                private String nickname;
                private String thumb_url;
                private String location;
                private boolean is_fresh;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getNickname() {
                    return nickname;
                }

                public void setNickname(String nickname) {
                    this.nickname = nickname;
                }

                public String getThumb_url() {
                    return thumb_url;
                }

                public void setThumb_url(String thumb_url) {
                    this.thumb_url = thumb_url;
                }

                public String getLocation() {
                    return location;
                }

                public void setLocation(String location) {
                    this.location = location;
                }

                public boolean isIs_fresh() {
                    return is_fresh;
                }

                public void setIs_fresh(boolean is_fresh) {
                    this.is_fresh = is_fresh;
                }
            }

            public static class CategoryBean {
                private int id;
                private String name;
                private String desc;
                private String show_name;
                private String type;
                private String specific_type;
                private String logo_url;
                private String background_url;
                private int subscriptors_num;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getShow_name() {
                    return show_name;
                }

                public void setShow_name(String show_name) {
                    this.show_name = show_name;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getSpecific_type() {
                    return specific_type;
                }

                public void setSpecific_type(String specific_type) {
                    this.specific_type = specific_type;
                }

                public String getLogo_url() {
                    return logo_url;
                }

                public void setLogo_url(String logo_url) {
                    this.logo_url = logo_url;
                }

                public String getBackground_url() {
                    return background_url;
                }

                public void setBackground_url(String background_url) {
                    this.background_url = background_url;
                }

                public int getSubscriptors_num() {
                    return subscriptors_num;
                }

                public void setSubscriptors_num(int subscriptors_num) {
                    this.subscriptors_num = subscriptors_num;
                }
            }
        }
    }
}
