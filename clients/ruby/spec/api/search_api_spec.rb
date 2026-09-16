require 'spec_helper'
require 'json'

describe 'SearchApi' do
  before do
    @api_instance = FeverClient::SearchApi.new
  end

  after do
  end

  describe 'test an instance of SearchApi' do
    it 'should create an instance of SearchApi' do
      expect(@api_instance).to be_instance_of(FeverClient::SearchApi)
    end
  end

  describe 'search test' do
    it 'should work' do
    end
  end

end
