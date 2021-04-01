package cn.stylefeng.hnt.core.exception;

import cn.stylefeng.hnt.core.consts.ProjectConstants;
import cn.stylefeng.roses.kernel.rule.exception.AbstractExceptionEnum;
import cn.stylefeng.roses.kernel.rule.exception.base.ServiceException;

/**
 * 业务异常
 *
 * @author g
 * @date 2020/12/16 14:26
 */
public class BusinessException extends ServiceException {

    public BusinessException(AbstractExceptionEnum exception, String userTip) {
        super(ProjectConstants.PROJECT_MODULE_NAME, exception.getErrorCode(), userTip);
    }

    public BusinessException(AbstractExceptionEnum exception) {
        super(ProjectConstants.PROJECT_MODULE_NAME, exception);
    }

}
