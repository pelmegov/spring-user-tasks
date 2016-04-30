package ru.pelmegov.usertasks.service;

import ru.pelmegov.usertasks.entity.User;

/**
 * @author modkomi
 * @since 29.04.2016
 */
public interface UserService {

    User getUser(String login);

}
