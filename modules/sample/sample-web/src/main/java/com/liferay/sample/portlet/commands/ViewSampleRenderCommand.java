package com.liferay.sample.portlet.commands;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.sample.constants.SampleWebPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author Eric Chin
 */
@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + SampleWebPortletKeys.SAMPLE_PORTLET,
		"mvc.command.name=/", "mvc.command.name=/view"
	},
	service = MVCRenderCommand.class
)
public class ViewSampleRenderCommand implements MVCRenderCommand {

	@Override
	public String render(
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws PortletException {

		_log.info("Calling ViewSampleRenderCommand#render");

		return "/view.jsp";
	}

	private static final Log _log = LogFactoryUtil.getLog(
		ViewSampleRenderCommand.class);

}