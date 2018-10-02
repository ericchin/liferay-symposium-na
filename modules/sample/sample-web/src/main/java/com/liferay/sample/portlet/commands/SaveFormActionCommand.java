package com.liferay.sample.portlet.commands;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.sample.constants.SampleWebPortletKeys;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author Eric Chin
 */
@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + SampleWebPortletKeys.SAMPLE_PORTLET,
		"mvc.command.name=/save_form"
	},
	service = MVCActionCommand.class
)
public class SaveFormActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		_log.info("Saving form");
	}

	private static final Log _log = LogFactoryUtil.getLog(
		SaveFormActionCommand.class);

}