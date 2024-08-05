package org.simp_blogApp.blogapp.service;

import org.simp_blogApp.blogapp.model.Comment;

public interface CommentService {

    Comment save(Comment comment);

    void delete(Comment comment);

}
