
#include "DebugComponent.hpp"

extern "C"
{
#include "nrf_log.h"
}


void DebugComponent::Write(const char* string)
{
    NRF_LOG_INFO("DebugComponent::Write() \r\n");

    //char test[20] = "help me \r\n";
    //NRF_LOG_RAW_INFO(string, test);

    nrf_log_frontend_std_0(NRF_LOG_LEVEL_INFO_RAW, string);
}

